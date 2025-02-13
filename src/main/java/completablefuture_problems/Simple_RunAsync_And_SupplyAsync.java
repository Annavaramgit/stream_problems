package completablefuture_problems;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Simple_RunAsync_And_SupplyAsync {


    //  @SneakyThrows
    public static void main(String[] args) {
//runAsync -->it is not return any thing just Void
/*
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("deafault thread created name by ForkJoinPool.commonPool:" + Thread.currentThread().getName());
            System.out.println("--------------");
        });
        future.join(); //this waits util cmplfure complete other wise main therad completes it exection and terminate
        System.out.println("main thread: " + Thread.currentThread().getName());
*/

//supplyAsync

  /*      CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("  and theard created is :"+ Thread.currentThread().getName());
            return "hello";
        });

        future.join();
        //get thows exception ,we can use try catch ot throws ot sneakythrows annoattaion
        System.out.println("res : "+future.join());
        System.out.println(" main thread: "+Thread.currentThread().getName());

*/

        /*callbacks of completablefuture
         * which are used for allow what to execute or to do after completablefuture complete
         * 1.thenAppy() ->uses for transform result of complateblefuture
         * 2.thenAccept()->consumes result of cmtbfure not return anything
         * 3.thenRun() ->not take input,and not return anything
         * 4.handle()->handle result or exception
         * 5.exceptionally()->handle exceptions
         */

        //thenApply()
      /*
       CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }).thenApply((res) -> {
            String res1 = res + " dear";
          //  System.out.println("final res is: " + res1);
            return res1;
        });
        System.out.println(future.join());
        */

        //thenAccept()
        /*
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }).thenAccept((res)-> System.out.println("result is :"+res));
         */

        //thenRun()
        /*
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }).thenRun(()-> System.out.println("task complted:"));
         */

        //handle()
        /*
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                int res = 10 / 0;
                return String.valueOf(res);
            } catch (Exception e) {
                throw new RuntimeException("error::" + e.getMessage());
            }
        }).handle((res, ex) -> {

            if (ex != null) {
                System.out.println("Exception in this task: " + ex.getMessage());
                return "Handled Exception Result"; // Return fallback value
            } else {
                return "Task Completed Successfully: " + res; // Return normal result
            }

        });
        future.join();
         */

        //exceptionally
        /*
        CompletableFuture<String> future =CompletableFuture.supplyAsync(()->{
           if(Math.random()<0.5){
               throw new RuntimeException("error ");
           }
           return "sucessfull";
        }).exceptionally((ex)->{
            return "exception::->"+ex.getMessage().toString();
        });
        System.out.println( future.join());
        */
    }


}
