package ff14_auto.entity;

/**
 * @author : 陈征
 * @date : 2021-07-02 19:36
 */

public class NoteEntity {
    public int note;

    public int time;

    public NoteEntity(int time, int note) {
        this.note = note;
        this.time = time;
    }

    @Override
    public String toString() {
        return "NoteEntity{" +
                "note=" + note +
                ", time=" + time +
                '}';
    }
}
