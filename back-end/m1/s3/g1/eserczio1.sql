--esercizio: estrazione nome Mario dalla lista dei clienti
--SELECT
	--nome
	--FROM 
		--esercizio1giorno.clienti
		--WHERE 
			--nome = 'Mario'
--SELECT 
	--nome,cognome
	--FROM	
		--esercizio1giorno.clienti
		--WHERE
			--anno_nascita = 1992
--SELECT
	--numero_fattura
	--FROM
		--esercizio1giorno.fatture
		--WHERE
			--iva = 22
--SELECT *  ---CHI?
	--FROM  ---DA QUALE TABELLA CON PATH DI SCHEMA.NOMETABELLA
		--esercizio1giorno.prodotti
		--WHERE	---CONDIZIONE CHE STO CERCANDO
		--EXTRACT(YEAR FROM data_attivazione) = 2010  ---CASO PARTICOLARE PER LE DATE IN ANNI QUANDO SONO IN FORMATO DATE E QUINDI è PREVISTO ANNO-MESE-GIORNO
		--AND(in_produzione = 'true' OR in_commercio = 'true') ---ALTRA VARIABILE CON VARIABILE AL SUO INTERNO DA VERIFICARE
--SELECT 
	--*
	--FROM --ESTRAGGO LE FATTURE
		--esercizio1giorno.fatture f
	--INNER JOIN esercizio1giorno.clienti c --ESTRAGGO ANCHE I CLIENTI
		--ON f.id_cliente = c.id_cliente --CON LO STESSO ID_CLINETE
		--WHERE --CON LA CONDIZIONE CHE L'IMPORTO IN FATTURA SIA MINORE DI 1000
			--importo < 1000


		
		