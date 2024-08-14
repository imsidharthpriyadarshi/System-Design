package LLD.Patterns.behavioral.iterator.collections;

import LLD.Patterns.behavioral.iterator.Aggregate;
import LLD.Patterns.behavioral.iterator.Iterators;
import LLD.Patterns.behavioral.iterator.types.Person;

import java.util.ArrayList;
import java.util.List;

public class Group implements Aggregate<Person> {
    private List<Person> grp=new ArrayList<>();
    public void  add(Person person){
        grp.add(person);
    }

    private class GroupItr implements Iterators<Person>{
        private List<Person> group;
        private int position;
        public GroupItr(List<Person> personList){
            this.group= personList;
            this.position=0;
        }
        @Override
        public boolean hasNext() {
            return this.position<grp.size();
        }

        @Override
        public Person next() {
            return grp.get(this.position++);
        }
    }
    @Override
    public  Iterators<Person> createIterator() {
        return new GroupItr(this.grp);
    }
}
