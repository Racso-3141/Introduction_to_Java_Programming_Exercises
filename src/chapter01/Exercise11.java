package chapter01;

public class Exercise11 {
    public static void main(String[] args) {
        int current_population = 312032486;
        int birth_seconds = 7;
        int death_seconds = 13;
        int immigrant_seconds = 45;
        int seconds_per_year = 365 * 86400;
        int changes_per_year = (seconds_per_year / birth_seconds -
                seconds_per_year / death_seconds + seconds_per_year / immigrant_seconds);
        int next_1_year_population = current_population + 1 * changes_per_year;
        int next_2_year_population = current_population + 2 * changes_per_year;
        int next_3_year_population = current_population + 3 * changes_per_year;
        int next_4_year_population = current_population + 4 * changes_per_year;
        int next_5_year_population = current_population + 5 * changes_per_year;
        System.out.println("The population for next 5 years are " + next_1_year_population
                + " " + next_2_year_population
                + " " + next_3_year_population
                + " " + next_4_year_population
                + " " + next_5_year_population);
    }
}
