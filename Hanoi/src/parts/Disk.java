package parts;

/**
 * Disk class in Tower of Hanoi
 * 
 * @author tadaki
 */
public class Disk implements Comparable<Disk> {
    private final int disk_size;// size of this disk

    public Disk(int disk_size) {
        this.disk_size = disk_size;
    }

    // 数値を返す なにを求めてるかによる
    @Override
    public int compareTo(Disk o) {
        if (this.disk_size < o.disk_size) {
            return o.disk_size;
        } else {
            return this.disk_size;
        }
    }

    // And define the function for the case of Disk class.
    @Override
    public String toString() {
        return "disk_size" + this.disk_size;
    }
}
