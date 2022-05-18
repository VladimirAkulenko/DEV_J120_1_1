/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
public class TelephoneNumber {
    private String areaCode;
    private String localNumber;

    public TelephoneNumber(String areaCode, String localNumber) {
        this.areaCode = areaCode;
        this.localNumber = localNumber;
        checkValue(areaCode, "Код региона");
        checkValue(localNumber, "Местный номер");
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }


    private void checkValue(String value, String partName) {
        if (value == null)
            throw new NullPointerException(partName + " пустое значение.");
        if (value.isEmpty())
            throw new IllegalArgumentException(partName + " пустая строка.");
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (!Character.isDigit(ch))
                throw new IllegalArgumentException(partName + " содержит недопустимые символы.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof TelephoneNumber)) return false;
        TelephoneNumber temp = (TelephoneNumber) obj;
        return temp.getAreaCode().equals(areaCode) && temp.getLocalNumber().equals(localNumber);
    }

    @Override
    public int hashCode() {
        return areaCode.hashCode() + localNumber.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(').append(areaCode).append(')');
        int p = localNumber.length() % 2+2;
        if (p < localNumber.length()) {
            sb.append(localNumber, 0, p);
            while (p <= (localNumber.length() - 2)) {
                sb.append('-').append(localNumber, p, p + 2);
                p += 2;
            }
        }else
            sb.append(localNumber);

        return sb.toString();
    }
}
