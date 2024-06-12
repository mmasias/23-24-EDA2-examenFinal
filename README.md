# Restaurante++

El [pyRestaurante](https://github.com/mmasias/23-24-PRG2-examenFinal/blob/main/README.md), desarrollado durante el examen final de la asignatura de Programación II, implementa el proceso de preparación de una hamburguesa.

El [código fuente presentado](/src/) cumple con los requisitos solicitados.

- Parte 1 - Propuestas _in plan english_
- Parte 2 - Dev...

## Caso

### Validación de hamburguesas

Dado el código y consciente de la realidad, el restaurante ha implementado un nuevo sistema de control de calidad para garantizar que las hamburguesas entregadas a los clientes sean **exactamente** las que se prepararon originalmente. Por lo tanto, se requiere incluir en la solución un mecanismo de validación para las hamburguesas creadas.

Específicamente, después de que un cocinero prepara una hamburguesa y antes de entregarla al empleado encargado de servir, se debe generar un mecanismo de validación para esa hamburguesa, de tal manera que cualquier cambio en los componentes de la hamburguesa se pueda detectar.

Por tanto, cuando el empleado recibe la hamburguesa del cocinero, debe verificar que la hamburguesa no ha sido alteradaantes de servirla al cliente.

- Proponga el mecanismo pertinente para generar el código de validación que garantice la integridad y unicidad del código generado. 
- Implemente un caso de uso que permita comprobar el funcionamiento de dicho mecanismo.

### Extensión de línea de negocio

Dado el éxito de sus hamburguesas, el restaurante ha decidido ampliar su menú e incluir kebabs. Un kebab es una pila de diferentes carnes que se van cortando y sirviendo a los clientes.

En previsión de esta extensión, hay que ajustar la solución para permitir la preparación y validación de kebabs. Al igual que con las hamburguesas, se requiere implementar un mecanismo de validación para garantizar que los kebabs entregados a los clientes sean **exactamente** los que se prepararon originalmente.

Proponga el modelado y el mecanismo pertinente para garantizar la integridad y unicidad del kebab preparado.

## Se evaluará

- **Código limpio.**
- **Proceso de creación que garantice la trazabilidad.**
- **Implementación clara y legible**
- Diseño.
  - Jerarquía de clases.
  - Reparto adecuado de responsabilidades y atributos.
  - Estructuración que evite al máximo código duplicado.
  - Estructuración que fomente el mínimo tamaño de clases.

> En negrita los puntos [*conditio sine qua non*](https://es.wikipedia.org/wiki/Sine_qua_non) para tener un examen evaluable.
