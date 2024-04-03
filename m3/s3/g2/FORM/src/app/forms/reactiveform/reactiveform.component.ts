import { Component } from '@angular/core';
import {
  AbstractControl,
  FormBuilder,
  FormControl,
  FormGroup,
  ValidationErrors,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrl: './reactiveform.component.scss',
})
export class ReactiveformComponent {
  form!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.form = this.fb.group({
      nome: this.fb.control(null, [Validators.required]),
      cognome: this.fb.control(null),
      authData: this.fb.group({
        email: this.fb.control(
          null,
          [Validators.required, Validators.email, this.emailProibiteValidator],
          this.emailEsistenteValidator
        ),
        password: this.fb.control(null),
      }),
    });
  }

  isValid(fieldName: string): boolean {
    const field = this.form.get(fieldName);
    if (!field) return false;

    return field.valid;
  }

  isTouched(fieldName: string): boolean {
    const field = this.form.get(fieldName);
    if (!field) return false;
    return field.touched;
  }

  ifValidAndTouched(fieldName: string) {
    return this.isValid(fieldName) && this.isTouched(fieldName);
  }

  getErrors(fieldName: string) {
    const field = this.form.get(fieldName);
    if (!field) return 'Invalid fieldName';
    return field.errors;
  }
  // da quì in poi guardati la lezione
  emailProibite: string[] = [
    'salvatoreGiordano@angular.com',
    'sara@wangular.it',
  ];
  emailProibiteValidator = (formC: FormControl): ValidationErrors | null => {
    if (this.emailProibite.includes(formC.value)) {
      return {
        invalid: true,
        message: 'Non può entrareehhh!!',
      };
    }

    return null; //non ci sono errori
  };

  emailEsistenteValidator(formC: AbstractControl) {
    return new Promise<ValidationErrors | null>((resolve, reject) => {
      setTimeout(() => {
        if (formC.value == 'admin@admin.it') {
          resolve({
            invalid: true,
            message: 'Non può entrareehhh!!',
          });
        }

        reject(null);
      }, 2000);
    });
  }
}
