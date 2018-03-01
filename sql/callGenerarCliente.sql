CALL generaCliente (
	'Eduardo Ocampo',
	'calle falsa 123',
	'57802613',
	'edd.develit@gmail.com',
	8000.00,
	'eduardo@gmail.com',
	@Cliente,
	@Cuenta,
	@Saldo,
	@Ejecutivo
);

SELECT
	@Cliente,
	@Cuenta,
	@Saldo,
	@Ejecutivo;