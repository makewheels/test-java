package test;

import java.util.concurrent.CompletableFuture;

/**
 * @Author makewheels
 * @Time 2021.02.06 21:45:40
 */
public class TestCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
                System.out.println("CompletableFuture1 finish");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture1 result ";
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
                System.out.println("CompletableFuture2 finish");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture2 result";
        }), (c1, c2) -> c1 + c2);
        System.out.println("exec main");
        System.out.println(completableFuture.join());
        System.out.println("main finish");
    }
}
