package com.musketeer.infra.web.musketeer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.musketeer.domain.Musketeer;
import com.musketeer.domain.Rank;

public record CreateMusketeer(
        @NotBlank String name,
        @NotNull Rank rank,
        @NotBlank String weapon
) {

  Musketeer toMusketeer() {
    return new Musketeer(name, rank, weapon);
  }
}