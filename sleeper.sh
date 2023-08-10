for i in {1..10}
 do
    current_time=$(date +"%H:%M:%S")
    process_count=$(ps -ef | wc -l)
    echo "$current_time $process_count"
# Change sleep
    sleep 3
done

processor	: 0
vendor_id	: AuthenticX86
cpu family	: 5
model		: 4
model name	: 05/04
stepping	: 3
cpu MHz		: 100.000
fdiv_bug	: no
f00f_bug	: no
coma_bug	: no
fpu		: yes
fpu_exception	: yes
cpuid level	: 1
wp		: yes
flags		: fpu tsc msr pae cx8 cmov clflush mmx fxsr sse sse2 rdtscp cpuid svm npt
bugs		:
bogomips	: 200.00
clflush size	: 64
cache_alignment	: 64
address sizes	: 32 bits physical, 32 bits virtual
power management:

Alpine Linux
Alpine Linux v3.12


for i in {50..100}
 do
    touch "$i.txt"
done
