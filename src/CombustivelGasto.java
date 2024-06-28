public class CombustivelGasto {

    public static void main(String[] args) {

        System.out.println("-------------------------------");
        System.out.println("R E S U L T A D O");
        System.out.println("-------------------------------");

        String vehicleModel = "Monza";
        byte vehicleAutonomy = 12;
        double distanceTraveled = 350;
        double fuelPrice = 5.49;
        double fuelUsed = distanceTraveled / vehicleAutonomy;
        double fuelSpent = fuelUsed * fuelPrice;

        System.out.println("Modelo do veículo: " + vehicleModel);
        System.out.println("Autonomia do veículo: " + vehicleAutonomy + " Km/L");
        System.out.println("Distância percorrida: " + distanceTraveled + " Km");
        System.out.println("Valor do combustível: R$" + fuelPrice);

        System.out.println("-------------------------------");
        System.out.println("Quantidade de combustível utilizado: " + fuelUsed + " L");
        System.out.println("Total gasto com a viagem: R$" + fuelSpent);
        System.out.println("-------------------------------");

    }

}
