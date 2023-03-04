package pl.sdacademy.java.advance.day1.Task7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class WeaponClip {
    private final Stack<String> weaponClip = new Stack<>();
 //   private final Deque<String> weaponClip = new ArrayDeque<>(); Dla kolejki Deque LIFO
    private final int maxNumberOfBulletInClip;

    public WeaponClip(int clipCapacity) {
        this.maxNumberOfBulletInClip = clipCapacity;
    }

    public void loadBullet(String bullet){
        if (maxNumberOfBulletInClip == weaponClip.size()){
            throw new IllegalArgumentException("Clip is full");
        }
        weaponClip.push(bullet);
    }

    public boolean isLoaded(){
        return weaponClip.size() >=1;
      // return !weaponClip.isEmpty(); deque
      // return !weaponClip.empty(); // Stack
    }

    public void shot(){
        if (isLoaded()){
            System.out.println(weaponClip.pop());
        }else {
            System.out.println("Clip is empty");

        }
    }
}
