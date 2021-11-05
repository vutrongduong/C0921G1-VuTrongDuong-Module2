package ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible;

import ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Animal;
import ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Chicken;
import ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Tiger;
import ss7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
