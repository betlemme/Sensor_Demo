# Sensor_Demo
MongoDB webapp demo (with jsp/jlst)

Il DB:
il database "demo_db" contiene la collezione "sample" che raggruppa documenti { _id, temp, date }, 
che descrivono il rivelamento della temperatura (temp) a un dato istante (date) da parte di un sensore remoto;

Descrizione Demo:
Il pulsante "get!" nella pagina iniziale della demo (index.jsp) invoca la servlet Prova, la quale pesca dal db
tutti i documenti della collezione "sample" e li passa alla pagina NewFile.jsp, che li visualizza in una tabella.

Struttura del progetto (paradigma MVC):
i due file .jsp index.jsp e NewFile.jsp sono contenuti nella cartella "webapp";
la catella "java" contiene tre sottocartelle:
-dayabase - contiene lee classi wrapper del db; 
-resource - contiene il bean Beanprova.java che fa da modello pe i dati del db;
-servlet - contiene Prova.java, servlet chiamata dal pulsante di index.jpg che invoca i metodi delle classi wrapper 
e restituiscce una lista di oggetti Beanpova a NewFile,jsp per la visualizzazione.
