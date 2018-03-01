DROP PROCEDURE IF EXISTS generaCliente;
DELIMITER $$
CREATE PROCEDURE generaCliente
(
	#Parámetros de entrada
	IN _nombre        VARCHAR(50),
	IN _direccion     VARCHAR(50),
	IN _telefono      VARCHAR(50),
	IN _correo        VARCHAR(50),
	IN _saldo 		    DOUBLE(20,2),
	IN _ejecutivo     VARCHAR(50),
	#Parámetros de salida
	OUT _idCliente    INT,
	OUT _idCuenta     INT,
	OUT _saldoOut     DOUBLE(15,2),
	OUT _ejecutivoOut VARCHAR(50)
)
BEGIN
	#Declarando variable donde se gaurdará el ultimo id de tabla cliente
	DECLARE _ultimoId INT;
	#Insertando a tabla cliente
	#INSERT INTO banco.cliente(nombre, direccion, telefono, correo) VALUES (_nombre, _direccion, _telefono, _correo);
	INSERT INTO info_banco2.cliente3(cliente3.Nombre, cliente3.Direccion, cliente3.Telefono, cliente3.Correo) VALUES (_nombre, _direccion, _telefono, _correo);
	#Obteniendo ultimo id de cliente
	SET _ultimoId = (SELECT MAX(id) AS id FROM cliente3);
	#Insertando a tabla cuenta
	#INSERT INTO banco.cuenta (saldo, ejecutivo, id_cliente) VALUES (_saldo, _ejecutivo, _ultimoId);
	INSERT INTO info_banco2.cuenta3(cuenta3.Saldo, cuenta3.Ejecutivo, cuenta3.id_cliente) VALUES (_saldo, _ejecutivo, _ultimoId);
	#Enviando parámetros de salida
	SELECT cuenta3.id, cuenta3.Saldo, cuenta3.Ejecutivo, cuenta3.id_cliente INTO _idCuenta, _saldoOut, _ejecutivoOut, _idCliente FROM cuenta3 WHERE cuenta3.id = _ultimoId;
END $$
DELIMITER ;