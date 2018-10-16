#!/bin/bash 
show_menu()
{
    NORMAL=`echo "\033[m"`
    MENU=`echo "\033[36m"` #Blue
    NUMBER=`echo "\033[33m"` #yellow
    FGRED=`echo "\033[41m"`
    RED_TEXT=`echo "\033[31m"`
    ENTER_LINE=`echo "\033[33m"`
    echo -e "${MENU}**********************APP MENU***********************${NORMAL}"
    echo -e "${MENU}**${NUMBER} 1)${MENU} HIVE ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 2)${MENU} PIG ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 3)${MENU} MAPREDUCE ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 4)${MENU} EXPORT ${NORMAL}"
    echo -e "${MENU}*********************************************${NORMAL}"
    echo -e "${ENTER_LINE}Please enter a menu option and enter or ${RED_TEXT}enter to exit. ${NORMAL}"
    read opt
}
function option_picked() 
{
    COLOR='\033[01;31m' # bold red
    RESET='\033[00;00m' # normal white
    MESSAGE="$1"  #modified to post the correct option selected
    echo -e "${COLOR}${MESSAGE}${RESET}"
}

function getpinCodeBank(){
	echo "in getPinCodebank"
	echo $1
	echo $2
	#hive -e "Select * from AppData where PinCode = $1 AND Bank = '$2'"
}

clear
show_menu
while [ opt != '' ]
    do
    if [[ $opt = "" ]]; then 
            exit;
    else
        case $opt in
        1) clear;
          echo "select the solution that you need"
            echo -e "${MENU}**${NUMBER} 1)${MENU} soln7 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 2)${MENU} soln8 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 3)${MENU} soln9 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 4)${MENU} soln10 ${NORMAL}"
          read  soln
          case $soln in
           1) clear;
            echo "enter the year"
            hive -e "select count(case_status),year from default.Q7 group by year"
            ;;

           2) clear;
             hive -e "select job_title,avg(prevailing_wage),year,full_time_position from niit.Q8 group by job_title,year,full_time_position sort by year;"
            ;;
           
           3) clear;
            hive -e "select employer_name,round((count(case_status)/99),2) as counts from niit.Q9 where case_status='CERTIFIED' or case_status='CERTIFIED WITHDRAWN' group by employer_name order by counts desc limit 10;"  
	     ;;
           
           4) clear;
            hive -e "select job_title,round((count(case_status)/99),2) as counts from niit.Q10 where case_status='CERTIFIED' or case_status='CERTIFIED WITHDRAWN' group by job_title order by counts desc limit 10;"  
	     ;;

           *) echo "Please Select one among the option[1-5]";;
               esac
               show_menu;
               ;;

        2) clear;
         echo "select the solution that you need"
            echo -e "${MENU}**${NUMBER} 1)${MENU} soln1A ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 2)${MENU} soln1B ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 3)${MENU} soln2A ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 4)${MENU} soln2B ${NORMAL}"
          read  soln
          case $soln in
           1) clear;
              pig -x local /home/arun/Desktop/pig/soln1a.pig 
            ;;

           2) clear;
              pig -x local /home/arun/Desktop/pig/soln1b.pig 
            ;;
           
           3) clear;
              pig -x local  /home/arun/Desktop/pig/soln2a.pig 
             ;;
           
           4) clear;
              pig -x local /home/arun/Desktop/pig/soln2b.pig   
	     ;;

           *) echo "Please Select one among the option[1-5]";;
               esac
               show_menu;
               ;;
            
        3) clear;
           echo "select the solution that you need"
            echo -e "${MENU}**${NUMBER} 1)${MENU} soln3 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 2)${MENU} soln4 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 3)${MENU} soln5 ${NORMAL}"
            echo -e "${MENU}**${NUMBER} 4)${MENU} soln6 ${NORMAL}"
          read  soln
          case $soln in
           1) clear;
             hadoop jar /home/arun/Desktop/datascientist.jar datascientist file:///home/arun/Desktop/inputpaths/Q3/8428534340 
              hadoop fs -cat /user/hduser/8428534340/p*
            ;;

          

           *) echo "Please Select one among the option[1-5]";;
               esac
               show_menu;
               ;;
	
        4) clear;
         echo "EXPORT TO SQL"
           hive -e "insert overwrite directory '/hanoid1'row format delimited fields terminated by ',' select job_title,round((count(case_status)/99),2) as counts from niit.Q10 where case_status='CERTIFIED' or case_status='CERTIFIED WITHDRAWN' group by job_title order by counts desc limit 10;"
           sqoop export --connect jdbc:mysql://localhost/college --username root --password 'root' --table h1b1 --export-dir /hanoid1/000000_0 --input-fields-terminated-by ',' ;
        show_menu;
        ;;
	

        \n) exit;
        ;;

        *) clear;
        option_picked "Pick an option from the menu";
        show_menu;
        ;;
    esac
fi



done


