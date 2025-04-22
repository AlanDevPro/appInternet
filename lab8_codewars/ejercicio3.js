function solucion(arr, k, str_) {
    console.log("Laboratorio 8 - SIS324: Limachi Villarroel Alan Nicolas");
    if (typeof k !== 'number' || k <= 0)
        return "Incorrect value for k";

    if (!['max', 'min'].includes(str_.toLowerCase()))
        return "Valid entries: 'max' or 'min'";

    if (!Array.isArray(arr) || arr.length === 0)
        return "No values in the array";

    for (let i = 0; i < arr.length; i++) {
        if (typeof arr[i] !== 'number' || !Number.isInteger(arr[i]))
            return "Invalid entry list";
    }

    let uniqueArr = [...new Set(arr)];
    uniqueArr.sort((a, b) => str_.toLOwerCase() === 'max' ? b - a : a - b);

    if (k > uniqueArr.length)
        return "No hay";

    return uniqueArr[k - 1];

}