import java.util.HashMap;
import java.util.Map;

class TrafficSignalOptimization {

    private static class IntersectionData {
        int vehicleCount;
        int pedestrianCount;

        IntersectionData(int vehicleCount, int pedestrianCount) {
            this.vehicleCount = vehicleCount;
            this.pedestrianCount = pedestrianCount;
        }
    }

    private static class TrafficSignalController {
        int greenLightDuration = 30;
        int redLightDuration = 30;
        int pedestrianSignalDuration = 10;

        void updateTimings(int greenDuration, int redDuration, int pedestrianDuration) {
            this.greenLightDuration = greenDuration;
            this.redLightDuration = redDuration;
            this.pedestrianSignalDuration = pedestrianDuration;
        }

        void displayTimings() {
            System.out.println("Green Light Duration: " + greenLightDuration + " seconds");
            System.out.println ("Red Light Duration: " + redLightDuration+ " Seconds");
            System.out.println ("Pedestrian Signal Duration: " + pedestrianSignalDuration+ "Seconds") ;
        }
    }

    public static void main(String arcs[})
   {

        Map<String, IntersectionData> intersections = new HashMap<>();
        intersections.put("Intersection1", new IntersectionData(50, 20));
        intersections.put("Intersection2", new IntersectionData(30, 10));

        Map<String, TrafficSignalController> controllers = new HashMap<>();
        for (String id : intersections.keySet()) {
            controllers.put(id, new TrafficSignalController());
        }

        for (Map.Entry<String, IntersectionData> entry : intersections.entrySet()) {
            IntersectionData data = entry.getValue();
            TrafficSignalController controller = controllers.get(entry.getKey());

            int greenDuration = 30;
            int redDuration = 30;
            int pedestrianDuration = 10;

            if (data.vehicleCount > 40) {
                greenDuration = 60;
                redDuration = 20;
            }
            if (data.pedestrianCount > 15) {
                pedestrianDuration = 30;
            }

            controller.updateTimings(greenDuration, redDuration, pedestrianDuration);
            controller.displayTimings();
        }
    }
}
