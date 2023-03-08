package com.reto.r1mendoza;

import com.reto.r1mendoza.repository.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;


@RestController
public class controller {

    @Autowired
    private cuentaLogic cuentaLogic;

    // Endpoint GET para obtener un Account por su ID
    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<?> getCuenta(@PathVariable("accountId") String accountId) {
        // Lógica para obtener el Account por su ID

        var response = cuentaLogic.getAccount(accountId);

        return ResponseEntity.ok(response);
    }

    // Endpoint GET para obtener todas las Cuentas
    @GetMapping("/accounts")
    public ResponseEntity<?> getCuentas() {
        // Lógica para obtener todos los Cuentas
        var data = cuentaLogic.getAccounts();
        var response = new ArrayList<>();

        response.add(data);

        return ResponseEntity.ok(response);
    }

    // Endpoint POST para crear un nueva Account
    @PostMapping("/accounts")
    public ResponseEntity<?> crearCuenta(@RequestBody Account account) {
        // Lógica para crear la cuenta

        var response = cuentaLogic.saveAccount(account);

        return ResponseEntity.ok(response);
    }

    // Endpoint PUT para actualizar un Account existente
    @PutMapping("/accounts")
    public ResponseEntity<?> actualizarCuenta(@RequestBody Account account) throws SQLException {
        // Lógica para actualizar el Account
        var response = cuentaLogic.saveAccount(account);

        return ResponseEntity.ok(response);
    }

    // Endpoint DELETE para eliminar un Account por su ID
    @DeleteMapping("/accounts/{accountId}")
    public ResponseEntity<?> eliminarCuenta(@PathVariable("accountId") String accountId) {
        // Lógica para eliminar el Account por su ID
        cuentaLogic.deleteAccount(accountId);

        return ResponseEntity.ok().build();
    }
}
