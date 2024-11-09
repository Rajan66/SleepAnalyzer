"use client"
import { cn } from "@/lib/utils";
import { usePathname } from "next/navigation";
import Link from "next/link";

type NavItemProps = {
  name: string;
  href: string;
};

const NavItem = ({ name, href }: NavItemProps) => {
  const pathname = usePathname()
  return (
    <Link
      href={href}
      className={cn(
        "px-[10px] py-[30px] text-nav text-black transition duration-150 opacity-80 hover:text-red-600",
        {
          "text-red-600  opacity-100": pathname === href,
        }
      )}
    >
      <div className="flex flex-col">
        {name}
        <span className={cn("hidden", { "block border-t-2 border-red-600": pathname === href })}></span>
      </div>
    </Link >
  );
};

export default NavItem;
