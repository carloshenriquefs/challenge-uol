package com.uol.host.backend.model;

import com.uol.host.backend.model.dto.PlayerDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name = "players")
@Table(name = "tb_players")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    private String phoneNumber;
    private String codiname;
    private GroupType groupType;

    public Player(PlayerDto playerDto) {
        name = playerDto.name();
        email = playerDto.email();
        phoneNumber = playerDto.phoneNumber();
        groupType = playerDto.groupType();
    }
}
