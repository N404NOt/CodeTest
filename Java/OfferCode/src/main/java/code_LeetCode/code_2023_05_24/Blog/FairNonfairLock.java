package code_LeetCode.code_2023_05_24.Blog;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairNonfairLock {

    // 公平锁
    private static Lock fairLock = new ReentrantLock(true);
    // 非公平锁
    private static Lock unFairLock = new ReentrantLock(false);

    public static void main(String[] args) {
        // 公平锁
        Thread fairThread1 = new Thread(new Task(fairLock),"fairThread1");
        Thread fairThread2 = new Thread(new Task(fairLock),"fairThread2");

        // 非公平锁
        Thread unFairThread1 = new Thread(new Task(unFairLock),"unFairThread1");
        Thread unFairThread2 = new Thread(new Task(unFairLock),"unFairThread2");

        // 启动线程
        fairThread1.start();
        fairThread2.start();

        unFairThread1.start();
        unFairThread2.start();
    }

    static class Task implements Runnable {

        private Lock lock;

        public Task(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            // 请求锁
            System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock.");
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
                // 执行需要同步的代码块
            } finally {
                lock.unlock();
                // 释放锁
                System.out.println(Thread.currentThread().getName() + " has released the lock.");
            }
        }

    }
}
