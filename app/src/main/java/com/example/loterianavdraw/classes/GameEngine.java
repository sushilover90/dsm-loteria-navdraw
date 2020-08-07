package com.example.loterianavdraw.classes;

import com.example.loterianavdraw.R;

public class GameEngine {

    private static String token = "Not Assigned";

    public static void setToken(String token){
        GameEngine.token = token;
    }

    public static String getToken(){
        return GameEngine.token;
    }

    public static int getCard(int cardNumber) {

        int number = 0;

        switch (cardNumber) {

            case 0: {
                number = R.drawable.uno;
                break;
            }
            case 1: {
                number = R.drawable.dos;
                break;
            }
            case 2: {
                number = R.drawable.tres;
                break;
            }
            case 3:{
                number = R.drawable.cuatro;
                break;
            }
            case 4:{
                number = R.drawable.cinco;
                break;
            }
            case 5:{
                number = R.drawable.seis;
                break;
            }
            case 6:{
                number = R.drawable.siete;
                break;
            }
            case 7:{
                number = R.drawable.ocho;
                break;
            }
            case 8:{
                number = R.drawable.nueve;
                break;
            }
            case 9:{
                number = R.drawable.diez;
                break;
            }
            case 10:{
                number = R.drawable.once;
                break;
            }
            case 11:{
                number = R.drawable.doce;
                break;
            }
            case 12:{
                number = R.drawable.trece;
                break;
            }
            case 13:{
                number = R.drawable.catorce;
                break;
            }
            case 14:{
                number = R.drawable.quince;
                break;
            }
            case 15:{
                number = R.drawable.dieciseis;
                break;
            }
            case 16:{
                number = R.drawable.diecisiete;
                break;
            }
            case 17:{
                number = R.drawable.dieciocho;
                break;
            }
            case 18:{
                number = R.drawable.diecinueve;
                break;
            }
            case 19:{
                number = R.drawable.veinte;
                break;
            }
            case 20:{
                number = R.drawable.veintiuno;
                break;
            }
            case 21:{
                number = R.drawable.veintidos;
                break;
            }
            case 22:{
                number = R.drawable.veintitres;
                break;
            }
            case 23:{
                number = R.drawable.veinticuatro;
                break;
            }
            case 24:{
                number = R.drawable.veinticinco;
                break;
            }
            case 25:{
                number = R.drawable.veintiseis;
                break;
            }
            case 26:{
                number = R.drawable.veintisiete;
                break;
            }
            case 27:{
                number = R.drawable.veintiocho;
                break;
            }
            case 28:{
                number = R.drawable.veintinueve;
                break;
            }
            case 29:{
                number = R.drawable.treinta;
                break;
            }
            case 30:{
                number = R.drawable.treintayuno;
                break;
            }
            case 31:{
                number = R.drawable.treintaydos;
                break;
            }
            case 32:{
                number = R.drawable.treintaytres;
                break;
            }
            case 33:{
                number = R.drawable.treintaycuatro;
                break;
            }
            case 34:{
                number = R.drawable.treintaycinco;
                break;
            }
            case 35:{
                number = R.drawable.treintayseis;
                break;
            }
            case 36:{
                number = R.drawable.treintaysiete;
                break;
            }
            case 37:{
                number = R.drawable.treintayocho;
                break;
            }
            case 38:{
                number = R.drawable.treintaynueve;
                break;
            }
            case 39:{
                number = R.drawable.cuarenta;
                break;
            }
            case 40:{
                number = R.drawable.cuarentayuno;
                break;
            }
            case 41:{
                number = R.drawable.cuarentaydos;
                break;
            }
            case 42:{
                number = R.drawable.cuarentaytres;
                break;
            }
            case 43:{
                number = R.drawable.cuarentaycuatro;
                break;
            }
            case 44:{
                number = R.drawable.cuarentaycinco;
                break;
            }
            case 45:{
                number = R.drawable.cuarentayseis;
                break;
            }
            case 46:{
                number = R.drawable.cuarentaysiete;
                break;
            }
            case 47:{
                number = R.drawable.cuarentayocho;
                break;
            }
            case 48:{
                number = R.drawable.cuarentaynueve;
                break;
            }
            case 49:{
                number = R.drawable.cincuenta;
                break;
            }
            case 50:{
                number = R.drawable.cincuentayuno;
                break;
            }
            case 51:{
                number = R.drawable.cincuentaydos;
                break;
            }
            case 52:{
                number = R.drawable.cincuentaytres;
                break;
            }
            case 53:{
                number = R.drawable.cincientaycuatro;
                break;
            }
        }

        return number;

    }
}
