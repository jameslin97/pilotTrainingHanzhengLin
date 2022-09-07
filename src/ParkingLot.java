public class ParkingLot {
    public enum VehicleType{
        CAR, BIKE, VAN
    }

    public enum ParkingSpotType{
        SMALL, MEDIUM, LARGE, DISABILITY
    }

    public abstract class Vehicle{
        private String licensePlate;
        private final VehicleType type;

        public Vehicle(VehicleType type){
            this.type = type;
        }

        public class Car extends Vehicle{
            public Car(){
                super(VehicleType.CAR);
            }
        }

        public class Bike extends Vehicle{
            public Bike(){
                super(VehicleType.BIKE);
            }
        }

        public class Van extends Vehicle{
            public Van(){
                super(VehicleType.VAN);
            }
        }
    }

    public abstract class ParkingSpot{
        private String number;
        private Vehicle vehicle;
        private final ParkingSpotType type;

        public ParkingSpot(ParkingSpotType type){
            this.type = type;
        }

        public class SmallSpot extends ParkingSpot{
            public SmallSpot(){
                super(ParkingSpotType.SMALL);
            }
        }

        public class MediumSpot extends ParkingSpot{
            public MediumSpot(){
                super(ParkingSpotType.MEDIUM);
            }
        }

        public class LargeSpot extends ParkingSpot{
            public LargeSpot(){
                super(ParkingSpotType.LARGE);
            }
        }

        public class DisabilitySpot extends ParkingSpot{
            public DisabilitySpot(){
                super(ParkingSpotType.DISABILITY);
            }
        }
    }
}
