package completablefuture_problems;

import java.util.concurrent.CompletableFuture;


public class ThenCombine {
    /**
     * suppose 3 methods/service
     * 1.one is get mail
     * 2.two is get weather reposrt
     * 3.third one need to send mail (which have one service),along with weather report (two have)
     * so here one and have no dependecy with each other
     * excuting one & two parallely and comibine result we use "thenCombine()"
     */


    public static CompletableFuture<String> getUserEmail() {
        System.out.println("email method thread:" + Thread.currentThread().getName());
        System.out.println("time in email: "+ System.currentTimeMillis());
        CompletableFuture<String> email = CompletableFuture.supplyAsync(() -> {
            return "satya@gmail.com";
        });
        return email;
    }

    public static CompletableFuture<String> getWeatherReport() {
        System.out.println("weather method thread: " + Thread.currentThread().getName());
        System.out.println("time in weather: "+ System.currentTimeMillis());
        return CompletableFuture.supplyAsync(() -> {
            return "cool with rainy";
        });

    }


    public static void main(String[] args) {
        getUserEmail().thenCombineAsync(getWeatherReport(), (e, w) -> {
            System.out.println("main: " + Thread.currentThread().getName());
            System.out.println("time for main: "+System.currentTimeMillis());
            return e + w;
        });

    }
}
