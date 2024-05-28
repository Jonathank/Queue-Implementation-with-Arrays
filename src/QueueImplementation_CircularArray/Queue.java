package QueueImplementation_CircularArray;

public interface Queue<T> {
int size();
boolean isEmpty();
T first();
void enqueue(T val);
T dequeue();
}
