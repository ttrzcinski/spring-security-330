package org.ttrzcinski;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    // Publiczna metoda GET
    @GetMapping("/api/public")
    public ResponseEntity<String> getPublicContent() {
// Tworzenie obiektu odpowiedzi
        String response = ToJson.asJSON("public content for all users");
        // Zwracanie odpowiedzi z kodem statusu 200 OK
        return ResponseEntity.ok(response);
    }

    // Zabezpieczona metoda POST
    @PostMapping("/api/protected")
    public ResponseEntity<String> postProtectedContent() {
// Tworzenie obiektu odpowiedzi
        SomeResponseObject response = SomeResponseObject.asJSON("protected content accessible with JWT");
// Zwracanie odpowiedzi z kodem statusu 201 CREATED
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}