# SendMessageViewBinding

El objetivo de este ejercicio es crear una aplicacion con varios activity que consiste en escribir un mensaje y luego enviarlo a otra activity

# Empezando a crear la aplicacion SendMessage



# Usando los intent y bundle



# Usando el logcat y los metodoa callback

Tambien vimos una herramienta que es bastante util que es el logcat que muestra información detallada sobre el funcionamiento de una aplicación Android mientras se está ejecutando en un dispositivo o emulador.
Con esta herramiento podemos ver errores que normalmente no podemos ver por ejemplo cuando queremos pulsar el boton para enviar el mensaje que hemos escrito en el SendMessageActivity y luego se nos cierra la aplicacion eso es porque ha ocurrido una excepcion eso lo podemos mirar en el logcat para saber que tipo de excepcion es y quien lo ha causado, asi podemos arreglar esos problemas. Tambien nos permite filtrar registros en función de etiquetas, niveles de prioridad y texto, lo que facilita la búsqueda de información específica en el registro.

En el concepto de ciclos de vida de un activity vimos los metodos callback que se utilizan para gestionar eventos o interacciones en una aplicación, con estos metodos nos permiten controlar y responder a eventos en la aplicación sin necesidad de activar manualmente funciones en respuesta a estas interacciones, hemos usado estos metodos en nuestra aplicacion y se pueden ver en el logcat en que estado estan se llaman estos metodos mediante Log.d(TAG, OnPause) por ejemplo cuando estamos en el ViewActivity cuando vemos el mensaje que hemos en SendMessageActivity si le damos a back, se ejecutara el metodo OnDestroy haciendo que la activity ViewActivity se destruya por completo haciendo que se libere cualquier recurso que ya no sea necesario.

# Viendo la depuracion paso a paso



# Creando variante SendMessageViewBinding



# Creando el About Us


# Capturas de pantalla de la aplicacion 


