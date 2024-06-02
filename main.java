import java.util.Scanner;

class Key{
    int custom;
    int duration;
    public static int count = 0;

    public Key()
    {
        count++;
        custom = 0;
        duration = 0;
    }
    public Key(int duration, int custom = 0)
    {
        this.custom = custom;
        this.duration = duration;
    }
    public int curr_key()
    {
        if(custom != 0) return custom;
        return duration;
    }
    public void update(int duration = 0, int custom = 0)
    {
        if(duration) this.duration = duration;
        else this.custom = custom;
    }
}

abstract class Value{
    String task_name;
    String file;

    public Value(String task_name, String file)
    {
        this.task_name = name;
        this.file = file;
    }

    abstract void handle_file();
}

class File_handler extends Value {
    public File_handler(String task_name, String file)
    {
        Super(task_name, file);
        File f = new File(file);
        
    }

}

public class Main {
    public static void main(String args[])
    {
        Key k = new Key();
        int count = Key.count;

    }
}

