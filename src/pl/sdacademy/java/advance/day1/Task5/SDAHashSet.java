package pl.sdacademy.java.advance.day1.Task5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SDAHashSet  {
    private Set<Object> hashSet ;

   public SDAHashSet(Set<Object> hashSet){
       this.hashSet = new HashSet<>();
   }

   public Set addToSDAHashSet(Object e){
       return Collections.singleton(hashSet.add(e));
   }

   public Set removeFromSDAHashSet(Object e){
       return Collections.singleton(hashSet.remove(e));
   }

    public int sizeSDAHashSet(Set hashSet){
       return hashSet.size();
    }

    public boolean contains(Object o){
       return hashSet.contains(o);
    }

    public void clearSDAHashSet(){
       hashSet.clear();
    }


    @Override
    public String toString() {
        return "SDAHashSet{" +
                "hashSet=" + hashSet +
                '}';
    }
}
