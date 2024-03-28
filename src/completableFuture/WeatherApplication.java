package completableFuture;

import java.util.concurrent.CompletableFuture;

public class WeatherApplication {
    public static void main(String[] args) {
        // Task 1: Fetch Weather Data from API 1N
        CompletableFuture<String> fetchWeatherDataAPI1 = CompletableFuture.supplyAsync(() -> {
            // Simulate fetching weather data from API 1
            return "Weather data from API 1";
        });

        // Task 2: Fetch Weather Data from API 2
        CompletableFuture<String> fetchWeatherDataAPI2 = CompletableFuture.supplyAsync(() -> {
            // Simulate fetching weather data from API 2
            return "Weather data from API 2";
        });

        // Task 3: Combine Results
        CompletableFuture<String> combineResults = fetchWeatherDataAPI1.thenCombine(fetchWeatherDataAPI2,
                (dataFromAPI1, dataFromAPI2) -> {
                    // Combine results to create a comprehensive weather report
                    return "Comprehensive Weather Report:\n" + dataFromAPI1 + "\n" + dataFromAPI2;
                });

        // Display the combined weather report
        combineResults.thenAccept(System.out::println);

        // Wait for all tasks to complete
        CompletableFuture.allOf(fetchWeatherDataAPI1, fetchWeatherDataAPI2, combineResults).join();

        System.out.println("Weather data processing completed");
    }
}
