package com.mycompany.proyectoprogra;


import javax.swing.JOptionPane;

public class ProyectoProgra {

    public static void main(String[] args) {
        boolean salir = false;
        boolean regresar = false;

        while (salir == false) {
            regresar = false;
            String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción:\n"
                    + "1. Registro\n"
                    + "2. Ingresar mercadería\n"
                    + "3. Editar precio\n"
                    + "4. Ver Inventario completo\n"
                    + "5. Salir");

            switch (opcion) {
                case "1":
                    while (regresar == false) {
                        String opcionRegistro = JOptionPane.showInputDialog(null, "Menú de Registro\n\n"
                                + "1. Registrar nuevos productos\n"
                                + "2. Registrar una marca\n"
                                + "3. Registrar una categoría\n"
                                + "4. Regresar\n\n"
                                + "Ingrese el número de la opción deseada:");

                        switch (opcionRegistro) {
                            case "1":
                                Producto producto = new Producto();

                                String nombreProducto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
                                String marcaProducto = JOptionPane.showInputDialog(null, "Ingrese la marca del producto:");
                                String categoriaProducto = JOptionPane.showInputDialog(null, "Ingrese la categoría del producto:");
                                String descripcionProducto = JOptionPane.showInputDialog(null, "Ingrese una descripción del producto:");

                                producto.setNombreProducto(nombreProducto);
                                producto.setPrecio(precio);
                                producto.setMarcaProducto(marcaProducto);
                                producto.setCategoriaProducto(categoriaProducto);
                                producto.setDescripcionProducto(descripcionProducto);

                                JOptionPane.showMessageDialog(null,
                                        "Informacion del Producto\n"
                                        + "\nNombre: " + producto.getNombreProducto()
                                        + "\nPrecio: " + producto.getPrecio()
                                        + "\nMarca: " + producto.getMarcaProducto()
                                        + "\nCategoria: " + producto.getCategoriaProducto()
                                        + "\nDescripcion: " + producto.getDescripcionProducto());
                                JOptionPane.showMessageDialog(null, "Producto registrado con éxito.");
                                break;
                            case "2":
                                Marca marca = new Marca();

                                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la marca:");
                                String pais = JOptionPane.showInputDialog(null, "Ingrese el pais de la marca:");
                                int funtacionYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de fundación de la marca:"));

                                marca.setNombreMarca(nombre);
                                marca.setPais(pais);
                                marca.setFundacionYear(funtacionYear);

                                JOptionPane.showMessageDialog(null,
                                        "Informacion de la Marca\n"
                                        + "\nNombre: " + marca.getNombreMarca()
                                        + "\nPais: " + marca.getPais()
                                        + "\nAño de Fundación: " + marca.getFundacionYear());
                                JOptionPane.showMessageDialog(null, "marca registrada con éxito.");
                                break;
                            case "3":
                                Categoria categoria = new Categoria();

                                String nombreCategoria = JOptionPane.showInputDialog(null, "Ingrese el nombre de la categoria:");
                                String descripcionCategoria = JOptionPane.showInputDialog(null, "Ingrese la descripción de la categoria:");

                                categoria.setNombreCategoria(nombreCategoria);
                                categoria.setDescripcionCategoria(descripcionCategoria);

                                JOptionPane.showMessageDialog(null,
                                        "Informacion del Producto\n"
                                        + "\nNombre: " + categoria.getNombreCategoria()
                                        + "\nDescripción: " + categoria.getDescripcionCategoria());
                                JOptionPane.showMessageDialog(null, "Categoria registrada con éxito.");
                                break;
                            case "4":
                                regresar = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingrese una opción válida, por favor!");
                                break;
                        }
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Usted ha elegido la opción de ingresar mercaderia.");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Usted ha elegido la opción de editar precio.");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Usted ha elegido la opción de ver inventario.");
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
