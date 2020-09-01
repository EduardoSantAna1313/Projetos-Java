/*
 * COPYRIGHT FH 2020 - ALL RIGHTS RESERVED.
 *
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of FH.
 */
package br.com.edu.excel.util;

/**
 * @author FH - edusilva
 *
 */
public class StringUtil {

    public enum Direction {
        RIGTH, LEFT;
    }

    /**
     * Create a new instance of StringUtil
     */
    private StringUtil() {
        // NA
    }

    public static String padding(final String pOriginalText, final int pSize, final char ch, final Direction pDir) {

        int length = 0;
        if (pOriginalText != null) {
            length = pOriginalText.length();
        }

        if (length >= pSize) {
            return pOriginalText.substring(0, pSize);
        }

        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < (pSize - length); i++) {
            result.append(ch);
        }
        if (Direction.RIGTH.equals(pDir)) {
            result.insert(0, pOriginalText);
        }
        else {
            result.insert(pSize - length, pOriginalText);
        }

        return result.toString();
    }
}
