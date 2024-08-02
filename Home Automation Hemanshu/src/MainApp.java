import java.util.Scanner;
import java.util.InputMismatchException;

public class MainApp {

	static House h1 = new House();

	static int ch1 = -1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			automation();
		} catch (InputMismatchException e) {
			System.out.println("Invlid Input");
		}

	}

	public static void automation() throws InputMismatchException {
		System.out.println("Enter House no");
		int hno = sc.nextInt();
		System.out.println("Enter House name");
		String hname = sc.next();

		h1.setHouse_no(hno);
		h1.setOwnerName(hname);

		int ch;
		do {
			System.out.println("1.add Room \n2.add Device \n3.Access Device\n4.display\n0. Exit");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				addRoom();

			}
				break;
			case 2: {
				addDevice();
			}
				break;
			case 3: {
				accessDevice();
			}
				break;
			case 4: {
				display();
			}
				break;
			}

		} while (ch != 0);
	}

	public static void addRoom() {
		int ch1;
		do {
			System.out.println("|  1     |        Kitchen                   |");
			System.out.println("|  2     |        Living area               |");
			System.out.println("|  3     |        Dining area               |");
			System.out.println("|  4     |        Bedroom                   |");
			System.out.println("|  5     |        WashRoom                  |");
			System.out.println("|  6     |        Corridors                 |");
			System.out.println("|  0     |        Exit                      |");
			System.out.println("Enter your choice:");
			ch1 = sc.nextInt();
			switch (ch1) {
			case 1: {
				Room r1 = new Room("Kitchen");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			case 2: {

				Room r1 = new Room("Living");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			case 3: {
				Room r1 = new Room("Dining");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			case 4: {
				Room r1 = new Room("Bedroom");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			case 5: {
				Room r1 = new Room("WashRoom");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			case 6: {
				Room r1 = new Room("Corridors");
				h1.rooms.add(r1);
				System.out.println("room created successfully");
				break;
			}
			}

		} while (ch1 != 0);
	}

	//////////////////////////////////////////////
	public static void addDevice() {

		int ch1;
		System.out.println("enter room name");
		String rm = sc.next();
		int i;
		i = searchRoom(rm);
		if (i == -1) {
			System.out.println("Room not found");
		} else {
			do {
				System.out.println("1.Lights\n2.Ac\n3.Tv\n4.Shower\n0.Exit");
				System.out.println("Enter your choice:");
				ch1 = sc.nextInt();
				switch (ch1) {
				case 1: {
					System.out.println("Enter device id");
					int id = sc.nextInt();

					h1.rooms.get(i).devices.add(new Lights(id, "Electronic Device", "Light"));
//    			h1.rooms[i][h1.rooms[i].getCtrd()]=new  Lights(id,"Electronic Device","Light");
//    			h1.rooms[i].setCtrd();
					System.out.println("Device add successfully");
				}
					break;
				case 2: {
					System.out.println("Enter device id");
					int id = sc.nextInt();
					h1.rooms.get(i).devices.add(new AirConditioners(id, "Electronic Device", "Ac"));
//    			h1.rooms[i].devices[h1.rooms[i].getCtrd()]=new  AirConditioners(id,"Electronic Device","Ac");
//    			h1.rooms[i].setCtrd();
//    			
					System.out.println("Device add successfully");
				}
					break;
				case 3: {
					System.out.println("Enter device id");
					int id = sc.nextInt();

					h1.rooms.get(i).devices.add(new Television(id, "Electronic Device", "Tv"));
//    			h1.rooms[i].devices[h1.rooms[i].getCtrd()]=new  Television(id,"Electronic Device","Tv");
//    			h1.rooms[i].setCtrd();
					System.out.println("Device add successfully");
				}
					break;
				case 4: {
					System.out.println("Enter device id");
					int id = sc.nextInt();
					h1.rooms.get(i).devices.add(new Shower(id, "Device", "Shower"));
//    			h1.rooms[i].devices[h1.rooms[i].getCtrd()]=new  Shower(id,"Device","Shower");
//    			h1.rooms[i].setCtrd();
					System.out.println("Device add successfully");
				}
					break;
				}
			} while (ch1 != 0);
		}
	}

	public static void accessDevice() {

		System.out.println("enter room name");
		String rm = sc.next();
		int i;
		i = searchRoom(rm);// h1.getRooms().indexOf(new Room(rm));
		if (i == -1)// h1.getRooms().contains(rm)!=false)
		{
			System.out.println("Room not found");
		} else {
			int j;

			do {
				System.out.println("Enter device name");
				String dname = sc.next();
				// j=searchDevice(i,dname);
				for (j = 0; j < h1.rooms.get(i).devices.size(); j++) {
					// System.out.println("j="+j +"size="+h1.rooms.get(i).devices.size());
					if (h1.rooms.get(i).devices.get(j).getName().equalsIgnoreCase(dname)) {
						System.out.println("j=" + j);
						System.out.println("1.Device on\n2.Device off\n3.check status\n4.Time\n5.Tv volume\n0.exit");
						System.out.println("Enter your choice:");
						ch1 = sc.nextInt();
						switch (ch1) {
						case 1: {
							if (h1.rooms.get(i).devices.get(j) instanceof Lights) {
								Lights l1 = (Lights) h1.rooms.get(i).devices.get(j);
								l1.turnOn();
								System.out.println("light on");
							} else if (h1.rooms.get(i).devices.get(j) instanceof AirConditioners) {
								AirConditioners a1 = (AirConditioners) h1.rooms.get(i).devices.get(j);
								a1.turnOn();
								System.out.println("Ac on");
							} else if (h1.rooms.get(i).devices.get(j) instanceof Television) {
								Television t1 = (Television) h1.rooms.get(i).devices.get(j);
								t1.turnOn();
								System.out.println("tv on");
							} else if (h1.rooms.get(i).devices.get(j) instanceof Shower) {
								Shower s1 = (Shower) h1.rooms.get(i).devices.get(j);
								s1.turnOn();
							}

						}
							break;
						case 2: {

							if (h1.rooms.get(i).devices.get(j) instanceof Lights) {
								Lights l1 = (Lights) h1.rooms.get(i).devices.get(j);
								l1.turnOff();
							} else if (h1.rooms.get(i).devices.get(j) instanceof AirConditioners) {
								AirConditioners a1 = (AirConditioners) h1.rooms.get(i).devices.get(j);
								a1.turnOff();
							} else if (h1.rooms.get(i).devices.get(j) instanceof Television) {
								Television t1 = (Television) h1.rooms.get(i).devices.get(j);
								t1.turnOff();
							} else if (h1.rooms.get(i).devices.get(j) instanceof Shower) {
								Shower s1 = (Shower) h1.rooms.get(i).devices.get(j);
								s1.turnOff();
							}

						}
							break;
						case 3: {
							if (h1.rooms.get(i).devices.get(j) instanceof Lights) {
								Lights l1 = (Lights) h1.rooms.get(i).devices.get(j);
								System.out.println("device is " + l1.getStatus());
							} else if (h1.rooms.get(i).devices.get(j) instanceof AirConditioners) {
								AirConditioners a1 = (AirConditioners) h1.rooms.get(i).devices.get(j);
								System.out.println("device is " + a1.getStatus());
							} else if (h1.rooms.get(i).devices.get(j) instanceof Television) {
								Television t1 = (Television) h1.rooms.get(i).devices.get(j);
								System.out.println("device is " + t1.getStatus());
							} else if (h1.rooms.get(i).devices.get(j) instanceof Shower) {
								Shower s1 = (Shower) h1.rooms.get(i).devices.get(j);
								System.out.println("device is " + s1.getStatus());
							}
						}
							break;
						case 4: {
							if (h1.rooms.get(i).devices.get(j) instanceof Lights) {
								Lights l1 = (Lights) h1.rooms.get(i).devices.get(j);
								l1.timeCal();
							} else if (h1.rooms.get(i).devices.get(j) instanceof AirConditioners) {
								AirConditioners a1 = (AirConditioners) h1.rooms.get(i).devices.get(j);
								a1.timeCal();
							} else if (h1.rooms.get(i).devices.get(j) instanceof Television) {
								Television t1 = (Television) h1.rooms.get(i).devices.get(j);
								t1.timeCal();
							} else if (h1.rooms.get(i).devices.get(j) instanceof Shower) {
								Shower s1 = (Shower) h1.rooms.get(i).devices.get(j);
								s1.timeCal();
							}
						}
							break;
						case 5: {
							int ch;
							do {
								System.out.println("\n1.increase\n2.Decrease\n0.exit");
								ch = sc.nextInt();
								switch (ch) {
								case 1: {
									if (h1.rooms.get(i).devices.get(j) instanceof Television) {
										Television t1 = (Television) h1.rooms.get(i).devices.get(j);
										t1.increse();
										System.out.println("volume is" + t1.getVolume());
									}
								}
									break;
								case 2: {
									if (h1.rooms.get(i).devices.get(j) instanceof Television) {
										Television t1 = (Television) h1.rooms.get(i).devices.get(j);
										t1.decrese();
										System.out.println("volume is" + t1.getVolume());
									}
								}
									break;

								}
							} while (ch != 0);

						}

							break;
						}
					}

				}

			} while (ch1 != 0);
		}

	}

	public static void display() {
		int ch1;
		int i;
		do {

			System.out.println("|  options  |              Menu             |");
			for (i = 0; i < h1.rooms.size(); i++) {
				System.out.println("|  " + (i + 1) + "     |    " + h1.rooms.get(i).getRoomType() + "             |");
			}
			System.out.println("|  0  |             exit              |");
			System.out.println("enter your choice");
			ch1 = sc.nextInt();
			switch (ch1) {
			case 1: {

				for (int j = 0; j < h1.rooms.get(0).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(0).devices.get(j).getName());
				}
			}
				break;
			case 2: {
				for (int j = 0; j < h1.rooms.get(1).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(1).devices.get(j).getName());
				}
			}
				break;
			case 3: {
				for (int j = 0; j < h1.rooms.get(2).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(2).devices.get(j).getName());
				}
			}
				break;
			case 4: {
				for (int j = 0; j < h1.rooms.get(3).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(2).devices.get(j).getName());
				}
			}
			case 5: {
				for (int j = 0; j < h1.rooms.get(4).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(2).devices.get(j).getName());
				}
			}
				break;
			case 6: {
				for (int j = 0; j < h1.rooms.get(5).devices.size(); j++) {
					System.out.println((j + 1) + h1.rooms.get(2).devices.get(j).getName());
				}
			}
				break;

			}

		} while (ch1 != 0);
	}

	public static int searchRoom(String rm) {
		for (int i = 0; i < h1.rooms.size(); i++) {
			if (h1.rooms.get(i).roomType.equalsIgnoreCase(rm)) {
				return i;
			}
		}
		return -1;
	}

	public static int searchDevice(int i, String dname) {
		System.out.println(h1.rooms.get(i).devices.size());
		for (int j = 0; j < h1.rooms.get(i).devices.size(); j++) {
			if (h1.rooms.get(i).devices.get(j).getName().equalsIgnoreCase(dname)) {
				System.out.println(h1.rooms.get(i).devices.get(j).getName());
				return j;
			}
		}
		return -1;
	}

}
