# ADOO
Analisis y Diseño Orientado a Objeto - TPO

Trabajo Práctico: Gestión de Consorcios

Condiciones generales
• El trabajo práctico debe realizarse de a, como máximo, 5 personas.
• Se debe entregar un único documento PDF con todas las consignas solicitadas (por cada entrega).
• Fechas de entregas:
o Primera entrega: 10 de Mayo
o Segunda entrega: 21 de Junio
• En los días de entrega se debe exponer la solución propuesta.


Contexto general
Nos han solicitado diseñar y desarrollar un componente de liquidación de expensas, dentro de un sistema web
de gestión de consorcios, para el uso de diferentes inmuebles de la ciudad y provincia de Buenos Aires.
Relevamiento
Los administradores del consorcio son los encargados de gestionar los gastos y expensas que tiene cada
consorcio en forma mensual.
Durante todo el mes, se generan y se cargan gastos de diferentes tipos: Servicios (Luz, Agua, Gas),
Mantenimiento de Ascensores, Seguros, etc. Cada gasto tiene un monto, un tipo y el mismo corresponde a un
tipo de expensa (ordinaria, extraordinaria, gastos particulares, fondos de reservas). Existen gastos que son
recurrentes y que el administrador puede indicarlo al cargarlo. Esto llevará a que al próximo mes el gasto sea
cargado de forma automática.
El consorcio está previamente configurado (por un administrador general de la plataforma, a través de otro
Servicio) con la cantidad de unidades funcionales que posee (departamentos, cocheras) y una cuenta bancaria
dónde se gestionan los fondos. A cada unidad funcional le corresponde un porcentaje del total a pagar, el cual
está previamente cargado y corresponde al número de metros cuadrados que posea. Cada unidad funcional
debe tener al menos un propietario y puede tener al menos un inquilino.
Al finalizar cada mes se debe calcular y generar las expensas por cada unidad funcional. Para el cálculo de las
expensas se puede elegir entre diferentes criterios y éstos pueden cambiar mes a mes, por decisión del
administrador.
Todos los criterios deben seguir 3 (tres) pasos básicos: “Obtención de Saldo”, “Cálculo de Gastos” y “División
de Expensas”. Los dos primeros son comunes a todos los Criterios y el último es particular del criterio. Los
criterios son: “Pago Completo de Gastos”, “Pago Completo con Fondos de Reservas”, “Pago Completo y
Generar Futuros Fondos de Reservas”. Se debe considerar la deuda que tiene cada unidad funcional en el
período anterior para el cálculo. El administrador del consorcio confirma el pago de las expensas de cada
unidad funcional, cada mes, de forma manual.
El consorcio posee un Saldo Actual en su Cuenta Bancaria que se utilizará para el cálculo de expensas. Para
conocer el Saldo Actual de la Cuenta del Banco del Consorcio, el sistema posee un componente desarrollado
por otro equipo que permite obtener el mismo. Este componente recibe el número de CBU o Alias, Fecha (de
la que se quiere obtener el saldo) y un Token de Seguridad. La expensa por unidad funcional calculada debe
tener: una fecha, un valor ordinario, un valor extraordinario y un total. Luego de la generación de las expensas,
las mismas deben ser enviadas a cada interesado. El sistema posee un componente de Notificaciones que
puede ser utilizado para dicho fin o bien se puede diseñar e implementar uno en forma interna. Cada
interesado tiene definido al menos un medio de notificación. Actualmente se están utilizando 3 (tres) medios
de notificación: email, WhatsApp, SMS. Si tiene varios medios definidos, uno debe ser por defecto.
Para finalizar, también se nos solicitó que se debe conocer qué administrador realizó la ejecución del cálculo
de expensas, fecha/hora y criterio seleccionado.


Alcance y Requerimientos
El sistema deberá permitir:
• Cargar Gastos de cada mes por parte del Administrador
• Cargar Gastos Recurrentes por parte del Administrador
• Calcular y Generar las Expensas en Forma Mensual, según el criterio seleccionado.
• Enviar las Expensas a cada interesado según el medio de notificación seleccionado.
• Tener trazabilidad de la ejecución del cálculo de expensas, conociendo mes a mes el pago de cada
unidad funcional.

Además, cabe destacar que:
• El Servicio de Login y Autenticación es externo a la plataforma.
• El Servicio Notificaciones, Catálogo de Consorcios, Personas, Saldo Cuentas son partes del Sistema,
pero no forman parte de nuestro componente. Debe quedar correctamente comunicado en su diseño
como interactúa con estos componentes o sistemas externos.


Consignas
• Primera entrega
o Realizar una iteración inicial del diagrama de clases del sistema, detallando, solamente, las
clases de la capa de dominio.
• Segunda entrega
o Realizar el diagrama de clases del sistema, detallando, solamente, las clases de la capa de
dominio.
o Justificar utilización de patrones de diseño en el caso que se hayan utilizado.
o Implementar el diagrama de clases propuesto en Java, mostrando el correcto funcionamiento
de los requerimientos principales a través de Test Unitarios.
