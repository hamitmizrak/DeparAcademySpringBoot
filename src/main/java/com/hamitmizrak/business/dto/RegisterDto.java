package com.hamitmizrak.business.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto  implements Serializable {

    // Seriştirme
    public static final Long serialVersionUID=1L;

    // ID
    private Long id;

    @NotNull(message = "{register.email.validation.constraints.NotNull.message}")
    private String uEmail;

    @NotNull(message = "{register.password.validation.constraints.NotNull.message}")
    private String uPassword;

    private Date createdDate;
}
