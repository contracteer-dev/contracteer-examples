package com.musketeer.domain;

public record Musketeer(
        Integer id,
        String name,
        Rank rank,
        String weapon
) {
  public Musketeer(String name, Rank rank, String weapon) {
    this(null, name, rank, weapon);
  }
}