package com.uol.host.backend.model.dto;

import com.uol.host.backend.model.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType

) {
}
