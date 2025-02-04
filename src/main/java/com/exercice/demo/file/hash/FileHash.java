package com.exercice.demo.file.hash;

import com.exercice.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
