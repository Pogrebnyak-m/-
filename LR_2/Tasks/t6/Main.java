package com;

public class Main {
    static class NetworkInfo {
        String ssid;
        String passwd;
        String securityType;

        public void showParameters() {
            System.out.println("имя: " + this.ssid);
            System.out.println("пароль: " + this.passwd);
            System.out.println("тип безопасности: " + this.securityType);
        }
    }

    public static NetworkInfo fill(String n, String p, String st) {
        NetworkInfo networkInfo = new NetworkInfo();
        networkInfo.ssid = n;
        networkInfo.passwd = p;
        networkInfo.securityType = st;
        return networkInfo;
    }

    public static void main(String[] args) {
        NetworkInfo ni = fill("user", "12345", "0");
        ni.showParameters();
    }
}







