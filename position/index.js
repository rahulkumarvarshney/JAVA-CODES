let arr=[
    {firstname:'rahul',lastname:'varshney',age:25},
    {firstname:'donald',lastname:'trump',age:76},
    {firstname:'vimpol',lastname:'okk',age:20},
    {firstname:'depika',lastname:'padukon',age:25}

]
let op=arr.filter((item)=>{
    if(item.age==25)
    {
        return true;
    }
}).map((item)=>{
    return item.firstname+" "+lastname;
})

