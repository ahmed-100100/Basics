Menu=input("1-admin login""\n""2-Register""\n""3-user login""\n")
if Menu =="1":#login dont work correct#admin Dont have id
    while input!=0:

        import os
        os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\admins' history")

        admin_name = input("Enter your name: ")
        admin_id=input("Enter your id: ")
        admin_email = input("Enter the admins' email: ")
        admin_pass = input(("Enter the admins' password: "))

        if admin_email == "admin" and admin_pass == "admin001":
            admin_loginfile = open("admins'login history.txt", "a+")
            admin_loginfile.write("\n"+"admin name:" + admin_name +" ,"+"and his id:"+admin_id+" ,"+"login statues:"+"successfully logged in"+"\n")
            print("\n"f"Welcome back {admin_name}""\n")
            break
        else:
            print("wrong pass or email")
            admin_loginfile = open("admins'login history.txt", "a+")
            admin_loginfile.write("admin name:" + admin_name+"  "+"his id:"+admin_id+"  "+"faild to login"+"\n")
            pass
    while input!="stop":
            admin_menu=input("1-Add Vaccination center""\n""2-remove Vaccination center""\n""3-Search in Vaccination center by its name""\n""4-See List registered users on the system""\n""5-Accept and decide a date for the user""\n")
            if admin_menu=="1":#creat
                center_name=input("Enter Vaccination center name: ")
                center_id=input("Enter the centre id: ")
                center_address=input("Enter the address: ")
                center_vacc=input("Enter list of vaccines: ")

                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\centers")

                center=open(center_name+".txt","w")
                center.write(center_name+"\n"+ center_id+"\n"+ center_address+"\n"+center_vacc)
                center_preview=print("Centre has been added""\n")
            elif admin_menu=="2":#remove

                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\centers")

                center_name=input("Enter the name of the center to remove: ")
                try:
                    os.remove(center_name+".txt")
                    print("center has been removed")
                except FileNotFoundError:
                    print("Center not found")

            elif admin_menu=="3":#search
                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\centers")
                center_name=input("Enter the center name: ")
                center=open(center_name+".txt","r")
                print("\n","center name:",center.readline())
                print("center id:",center.readline())
                print("center address:",center.readline())
                print("center list of vaccines:",center.readline(),"\n")
                center.close()
            elif admin_menu=="4":#list registered
                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                import os

                for path, dirs, files in os.walk(r"C:\Users\Ahmed\PycharmProjects\python project is2\request"):
                    for f in files:
                        filename = os.path.join(path, f)
                        with open(filename, "r") as myfile:
                            print("----------", "\n", myfile.read(), "\n""-------------""\n")
            elif admin_menu=="5":
                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                user_name=input("Enter user name: ")
                admin_acc=input("Enter your decision: ")
                admin_date=(input("Enter the date: "))
                user_accept=open(user_name+".txt","a+")
                user_accept.write(admin_acc+"\n"+"your date is:"+admin_date)
                print("your decision",admin_acc,"has been sent")

            ask=input("continue?")
            if ask=="yes":
                continue
            else:
                break


    else:
        print("wrong")
#register for users work great
elif Menu=="2":
        user_name=input("Choose a name:")
        user_email=input("Enter your email: ")
        user_phonenumber=input("Enter your phone number: ")
        user_id = input("Enter your id: ")
        user_national_id = input("Enter your national id: ")
        user_pass=input("Enter your password: ")
        import os
        os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\users")
        user_account=open(user_name+".txt","w")
        user_account.write(user_name+"\n"+user_email+"\n"+user_phonenumber+"\n"+user_id+"\n"+user_national_id+"\n"+user_pass)
        print("Welcome",user_name)
        while input != "stop":
            user_menu=input("1-See Vaccination centers list""\n""2-Reserve vaccination""\n""3-Reservation result")
            if user_menu=="1":
                import os
                for path,dirs,files in os.walk(r"C:\Users\Ahmed\PycharmProjects\python project is2\centers"):
                    for f in files:
                        filename=os.path.join(path,f)
                        with open(filename,"r")as myfile:
                            print("----------","\n",myfile.read(),"\n""-------------""\n")
            elif user_menu=="2":
                user_name=input("Enter your name: ")
                user_id=input("Enter your id: ")
                user_centerid=input("Enter vaccination center id: ")
                user_vaccname=input("Enter vaccine name: ")
                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                user_request=open(user_name+".txt","w+")
                user_request.write(user_name+"\n"+user_id+"\n"+user_centerid+"\n"+user_vaccname+"\n"+"statues:"+"\n")
            elif user_menu == "3":
                while input != "stop":
                    import os

                    os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                    user_name = input("Enter your name: ")
                    user_account = open(user_name + ".txt", "r")
                    user_account.readlines()
                    if user_name != int:
                        print(user_account.readlines())
                    else:
                        print("try again")
                user_ask = input("Continue?")
                if user_ask == "yes":
                    continue
                else:
                    break
            ask2=input("continue?")
            if ask2 =="yes":
                continue
            else:
                break




#login work with pass only
elif Menu=="3":

    import os
    os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\users")

    user_name = input("Enter your name: ")
    user_id = input("Enter your id: ")
    user_pass= input("Enter your password: ")
    user_account = open(user_name+".txt", "r")
    if user_pass == user_account.readlines()[5]:
        print("\n"+"welcome back"+"\n")
        while input != "stop":
            user_menu=input("1-See Vaccination centers list""\n""2-Reserve vaccination""\n""3-Reservation result")
            if user_menu=="1":
                import os
                for path,dirs,files in os.walk(r"C:\Users\Ahmed\PycharmProjects\python project is2\centers"):
                    for f in files:
                        filename=os.path.join(path,f)
                        with open(filename,"r")as myfile:
                            print("----------","\n",myfile.read(),"\n""-------------""\n")
            elif user_menu=="2":
                user_name = input("Enter your name: ")
                user_id = input("Enter your id: ")
                user_centerid = input("Enter vaccination center id: ")
                user_vaccname = input("Enter vaccine name: ")
                import os
                os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                user_request = open(user_name + ".txt", "w+")
                user_request.write(user_name + "\n" + user_id + "\n" + user_centerid + "\n" + user_vaccname + "\n" + "statues:" + "\n")
            elif user_menu=="3":
                while input!="stop":
                    import os
                    os.chdir(r"C:\Users\Ahmed\PycharmProjects\python project is2\request")
                    user_name=input("Enter your name: ")
                    user_account=open(user_name+".txt","r")
                    user_account.readlines()
                    if user_name !=int:
                        print(user_account.readlines())
                    else:
                        print("try again")
                user_ask=input("Continue?")
                if user_ask=="yes":
                    continue
                else:
                    break







            ask2=input("continue?")
            if ask2 =="yes":
                continue
            else:
                break

    else:
        print("wrong")