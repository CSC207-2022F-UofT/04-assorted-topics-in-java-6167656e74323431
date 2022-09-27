/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /**
     * Adds the Drivable item to this map if it does not already exist in the map.
     *
     * @param id   the ID of the Drivable item
     * @param item the Drivable item to add
     *
     * @return true if
     */
    public boolean addDrivable(String id, Drivable item) {
        if (drivable_map.containsKey(id)) {
            return false;
        }

        drivable_map.put(id, item);

        return true;
    }

    /**
     * Checks if the DrivableMap has an item that is faster or equal to speed.
     *
     * @param speed the minimum speed to filter by
     *
     * @return true if this map contains an item with speed or greater.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable item : drivable_map.values()) {
            if (item.getMaxSpeed() >= speed) {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets a list of all the Tradable items in this map.
     *
     * @return a list of all the Tradable items in this map.
     */
    public List<Tradable> getTradable() {
        List<Tradable> results = new ArrayList<>();

        for (Drivable item : drivable_map.values()) {
            if (item instanceof Tradable) {
                results.add((Tradable) item);
            }
        }

        return results;
    }
}