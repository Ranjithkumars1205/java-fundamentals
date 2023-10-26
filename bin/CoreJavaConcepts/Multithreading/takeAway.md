Multiple threads within a process can execute concurrently (simutaneously), allowing for parallel processing and improved performance. - check line no - 9(In a multithreaded Java program running on a single-core processor). 

Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

Threads within a process can communicate and share data more easily compared to processes.

In a single-core processor, only one thread can execute at a time. This is because the processor can only execute one instruction (thread) at a time. However, in a multicore processor, multiple threads can execute simultaneously if there are multiple cores available. Each core can handle one thread independently, allowing for true concurrent execution of multiple threads.

**In a multithreaded Java program running on a single-core processor, the operating system's thread scheduler rapidly switches between different threads, giving the illusion of parallel execution. ** his is known as time-sharing or time slicing. Each thread gets a small time slice during which it can execute before the scheduler switches to the next thread. This creates the effect of concurrent execution, even though only one thread is actually executing at any given moment on a single-core processor.

In summary, while a single-core processor can only execute one thread at a time, multithreading allows for concurrent execution and efficient utilization of the processor's time by rapidly switching between threads. On a multicore processor, multiple threads can execute simultaneously, providing true parallelism.

A process is a program in execution. It consists of the program's code, data, and resources such as file handles and memory. Each process has its own memory space, making it independent of other processes. Processes are managed by the operating system and ** can contain one or more threads **.

Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

1) Process-based Multitasking (Multiprocessing)
Each process has an address in memory. In other words, each process allocates a separate memory area.
A process is heavyweight.
Cost of communication between the process is high.
Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
2) Thread-based Multitasking (Multithreading)
Threads share the same address space.
A thread is lightweight.
Cost of communication between the thread is low.