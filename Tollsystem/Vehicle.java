class vehicle {

    
    public static double calculateToll(String vehicleType, boolean hasRfidPass) {
    
        double tollFee = 0.0;
        

        switch (vehicleType) {
            case "Car":
                tollFee = 100;
                break;
            case "Truck":
                tollFee = 200;
                break;
            default:
                System.out.println("Invalid vehicle type");
                return -1; 
        }
        
        
        if (hasRfidPass) {
            tollFee -= tollFee * 0.10; 
        }
        
        return tollFee;
    }


    public static void processVehicles(String[][] vehicles) {
        for (String[] vehicle : vehicles) {
            String vehicleType = vehicle[0]; 
            boolean hasRfidPass = Boolean.parseBoolean(vehicle[1]); 
            
        
            double toll = calculateToll(vehicleType, hasRfidPass);
            

            if (toll != -1) {
                System.out.printf("Vehicle Type: %s, Toll Fee: ₹%.2f\n", vehicleType, toll);
            }
        }
    }

    public static void main(String[] args) {
        
        String[][] vehicles = {
            {"Car", "true"},
            {"Truck", "false"},
            {"Car", "false"},
            {"Truck", "true"}
        };

        
        processVehicles(vehicles);
    }
}
