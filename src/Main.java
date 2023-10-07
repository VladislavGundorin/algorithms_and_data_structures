////public class Main {
////    public static void main(String[] args) {
////        DoublyLinkedList<Minion> doublyLinkedList = new DoublyLinkedList<>();
////        Minion minion1 = new Minion("Костя",10);
////        Minion minion2 = new Minion("Ростик",5);
////        Minion minion3 = new Minion("Женя",15);
////
////        doublyLinkedList.addFirst(minion1);
////        doublyLinkedList.addLast(minion2);
////        doublyLinkedList.addLast(minion3);
////
////        doublyLinkedList.show();
////
////        doublyLinkedList.removeByAge(5);
////        doublyLinkedList.show();
////
////        doublyLinkedList.editByMinionName("Женя",20);
////        doublyLinkedList.show();
////
////        doublyLinkedList.deleteFirst();
////        doublyLinkedList.show();
////
////        doublyLinkedList.deleteLast();
////        doublyLinkedList.show();
////
////        doublyLinkedList.clear();
////
////    }
////}
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        DoublyLinkedList<Minion> doublyLinkedList = new DoublyLinkedList<>();
//        Minion minion1 = new Minion("Костя", 10);
//        Minion minion2 = new Minion("Ростик", 0);
//        Minion minion3 = new Minion("Женя", 15);
//        Minion minion4 = new Minion("Антон", 35);
//        Minion minion5 = new Minion("Pudge", 75);
//
//        doublyLinkedList.addFirst(minion1);
//        doublyLinkedList.addLast(minion2);
//        doublyLinkedList.addLast(minion3);
//        doublyLinkedList.addLast(minion4);
//        doublyLinkedList.addLast(minion5);
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Выберите действие: ");
//            System.out.println("1. Показать список: ");
//            System.out.println("2. Удалить по возрасту: ");
//            System.out.println("3. Изменить возраст по имени: ");
//            System.out.println("4. Удалить первый элемент: ");
//            System.out.println("5. Удалить последний элемент: ");
//            System.out.println("6. Очистить список: ");
//            System.out.println("7. Выйти из программы: ");
//            System.out.println("8. Тест стека база: ");
//            System.out.println("9. Сортируем список с использованием компаратора: ");
//            System.out.println("10. Вывод по индексу: ");
//            System.out.println("11. Список миньонов после сортировки по возрасту: ");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    doublyLinkedList.show();
//                    break;
//                case 2:
//                    System.out.print("Введите возраст для удаления: ");
//                    int ageToRemove = scanner.nextInt();
//                    doublyLinkedList.removeByAge(ageToRemove);
//                    break;
//                case 3:
//                    System.out.print("Введите имя для изменения возраста: ");
//                    String nameToEdit = scanner.next();
//                    System.out.print("Введите новый возраст: ");
//                    int newAge = scanner.nextInt();
//                    doublyLinkedList.editByMinionName(nameToEdit, newAge);
//                    break;
//                case 4:
//                    doublyLinkedList.deleteFirst();
//                    break;
//                case 5:
//                    doublyLinkedList.deleteLast();
//                    break;
//                case 6:
//                    doublyLinkedList.clear();
//                    break;
//                case 7:
//                    System.out.println("Программа завершена.");
//                    scanner.close();
//                    System.exit(0);
//                    break;
//                case 8:
//                    Stack<Integer> stack = new Stack<>();
//                    stack.push(1);
//                    stack.push(2);
//                    stack.push(3);
//
//                    System.out.println("Стек после добавления элементов: " + stack);
//                    System.out.println("Стек пуст? " + stack.isEmpty());
//
//                    int poppedElement = stack.pop();
//                    System.out.println("Удаленный элемент из стека: " + poppedElement);
//
//                    System.out.println("Стек после удаления элемента: " + stack);
//                    break;
//                case 9:
//                    List<Minion> minions = new ArrayList<>();
//                    minions.add(new Minion("Костя", 10));
//                    minions.add(new Minion("Ростик", 5));
//                    minions.add(new Minion("Федя", 15));
//                    minions.add(new Minion("Антон", 35));
//                    minions.add(new Minion("Сеня", 75));
//
//                    NameComparator comparator = new NameComparator();
//
//                    Collections.sort(minions, comparator);
//
//                    System.out.println("Список миньонов после сортировки:");
//                    for (Minion minion : minions) {
//                        System.out.println(minion.getName() + ", возраст: " + minion.getAge());
//                    }
//                    break;
//                case 10:
//                    int index = scanner.nextInt();
//                    Minion minionAtIndex = doublyLinkedList.get(index);
//                    System.out.println("Элемент по индексу " + index + ": " + minionAtIndex);
//                    break;
//                case 11:
//                    List<Minion> minions_2 = new ArrayList<>();
//                    minions_2.add(new Minion("Костя", 10));
//                    minions_2.add(new Minion("Ростик", 5));
//                    minions_2.add(new Minion("Федя", 15));
//                    minions_2.add(new Minion("Антон", 35));
//                    minions_2.add(new Minion("Сеня", 75));
//
//                    AgeComparator comparator_2 = new AgeComparator();
//
//                    Collections.sort(minions_2, comparator_2);
//
//                    System.out.println("Список миньонов после сортировки по возрасту:");
//                    for (Minion minion : minions_2) {
//                        System.out.println(minion.getName() + ", возраст: " + minion.getAge());
//                    }
//                    break;
//                default:
//                    System.out.println("Неверный выбор. Пожалуйста, введите номер действия от 1 до 7.");
//            }
//        }
//    }
//}
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Stack<Minion> minionStack = new Stack<>();
                minionStack.push(new Minion("Костя", 10));
                minionStack.push(new Minion("Ростик", 5));
                minionStack.push(new Minion("Федя", 15));
                minionStack.push(new Minion("Антон", 35));
                minionStack.push(new Minion("Сеня", 75));
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Выберите действие: ");
                    System.out.println("1. Добавить миньона в стек");
                    System.out.println("2. Удалить миньона из стека");
                    System.out.println("3. Показать стек");
                    System.out.println("4. Выйти");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Введите имя миньона: ");
                            String name = scanner.next();
                            System.out.print("Введите возраст миньона: ");
                            int age = scanner.nextInt();
                            Minion minion = new Minion(name, age);
                            minionStack.push(minion);
                            System.out.println("Миньон добавлен в стек.");
                            break;
                        case 2:
                            if (!minionStack.isEmpty()) {
                                Minion removedMinion = minionStack.pop();
                                System.out.println("Удален миньон из стека: " + removedMinion);
                            } else {
                                System.out.println("Стек пуст.");
                            }
                            break;
                        case 3:
                            System.out.println("Содержимое стека: " + minionStack);
                            break;
                        case 4:
                            System.out.println("Программа завершена.");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Неверный выбор. Пожалуйста, введите номер действия от 1 до 4.");
                    }
                }
            }
        }
