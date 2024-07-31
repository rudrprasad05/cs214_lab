a = [2.50 1.00 33.90 7.00 200.00];
b = [3 0 0 1 1;
    0 1 1 0 0;
    5 0 0 0 0;
    3 4 2 1 0;
    0 0 0 0 1;
    7 0 3 0 0];

prod = b .* a;
totalSum = sum(prod,"all");
disp(totalSum);

x = [-100:10:100];
y = x.^2;

plot(x,y);