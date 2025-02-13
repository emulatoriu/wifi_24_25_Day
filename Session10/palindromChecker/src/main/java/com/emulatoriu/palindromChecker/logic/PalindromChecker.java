package com.emulatoriu.palindromChecker.logic;

import org.springframework.stereotype.Service;

@Service
public class PalindromChecker {
    public boolean isWordPalindrom(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString()
                .equalsIgnoreCase(word);
    }
}
