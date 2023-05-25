package code_LeetCode.code_2023_05_24.Blog;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairNonfairLockExample {
    private static Lock fairLock = new ReentrantLock(true); // 公平锁
    private static Lock nonfairLock = new ReentrantLock(false); // 非公平锁
    
    public static void main(String[] args) {
        // 使用公平锁
        Thread fairThread1 = new Thread(new Task(fairLock), "FairThread1");
        Thread fairThread2 = new Thread(new Task(fairLock), "FairThread2");
        
        // 使用非公平锁
        Thread nonfairThread1 = new Thread(new Task(nonfairLock), "NonfairThread1");
        Thread nonfairThread2 = new Thread(new Task(nonfairLock), "NonfairThread2");
        
        fairThread1.start();
        fairThread2.start();
        nonfairThread1.start();
        nonfairThread2.start();
    }
    
    static class Task implements Runnable {
        private Lock lock;
        
        public Task(Lock lock) {
            this.lock = lock;
        }
        
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock.");
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
                // 执行需要同步的代码块
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " has released the lock.");
            }
        }
    }
}
