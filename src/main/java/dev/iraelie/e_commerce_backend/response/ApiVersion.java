package dev.iraelie.e_commerce_backend.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiVersion {
    private String message;
    private Object data;
}
