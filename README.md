# Sensor_Demo
MongoDB webapp demo (with jsp/jlst)

Il DB:
il database "demo_db" contiene la collezione "sample" che raggruppa documenti {temp, date}, 
che descrivono il rivelamento della temperatura (temp) a un dato istante (date) da parte di un sensore remoto;

Descrizione Demo:
Il pulsante "get!" nella pagina iniziale della demo (index.jsp) invoca la servlet Prova, la quale pesca dal db
tutti i documenti della collezione "sample" e li passa alla pagina NewFile.jsp, che li visualizza in una tabella.

Struttura del progetto:
