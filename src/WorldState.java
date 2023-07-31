

public class WorldState {

    // переменная 1
    boolean isItWar = true;
    //п еременная 2
    boolean isItGoodSociety = false;
    // переменная 3
    boolean isWaterExists = true;
    // переменная 4
    boolean isItEconomyCrisis = false;
    // переменная 5
    boolean isItEpidemic = false;
    // переменная 6
    boolean isItHunger = true;
    // переменная 7
    boolean isTechnologiesExist = true;



// Логика "Плохого Мира" - если одно из негативных описаний мира правдиво + все хорошее описание - ложь, то и мир Плохой.
    void isWorldNegativelyGood() {



      boolean isWorldStateBad = (isItWar || isItHunger || isItEpidemic || isItEconomyCrisis) && !(isWaterExists && isTechnologiesExist && isItGoodSociety);


        System.out.println("Если в мире есть война, или голод, или эпидемия, или экономический кризис");
        System.out.println("и правда в том, что нет воды, и нет технологий, и нет хорошего общества,");
        System.out.println("то мир в плохом состоянии и это " + isWorldStateBad + "(правда)");
        System.out.println(" ");
    }

    // Логика "Хорошего Мира" - если одно из хороших описаний мира правдиво, + все плохое описание - ложь, то и мир Хороший.
    void isWorldPositivelyGood() {



      boolean isWorldStateGood = (isItGoodSociety || isWaterExists || isTechnologiesExist) && !(isItWar && isItEpidemic && isItHunger && isItEconomyCrisis);

        System.out.println("Если в мире хорошее общество, или есть вода, или есть технологии");
        System.out.println("и правда в том что нет войны, и нет эпидемии, и нет голода, и нет экономического кризиса, ");
        System.out.println("то миро в хорошем состоянии и это " + isWorldStateGood + "(правда)");

    }












    }

